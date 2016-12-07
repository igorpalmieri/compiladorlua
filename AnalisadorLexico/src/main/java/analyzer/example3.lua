local launchArgs = ...;

display.setStatusBar(display.HiddenStatusBar);

local BaseState = require("BaseState");
local together = require("plugin.together");
local json = require("json");

local AND = "android";
local IOS = "ios";
local WIN = "windows";

platform = IOS;

local deviceIsIPad = false;

if system.getInfo("model") == "iPad" then
    deviceIsIPad = true;
end;

_G.deviceIsIPad = deviceIsIPad;
currentState = nil;

local previousStateType = 0;
local currentStateType = 0;
local refreshUserStats = false;
local lastTime = 0;
local stateStack = {};
local poppedState;
local messages = {};
local backMessageBuffer = {};
local resumingStates = false;
local resumeScreen;
local MaxElapsedTime = 0.04;        	--This number represents 20 FPS. If we dip below that, don"t freak out.
local MaxTimeToResume = 60 * 60 * 8;	--How long we should wait before restarting at the splash screen
results = {};
local floor = math.floor;
local ceil = math.ceil;
local abs = math.abs;

table.print = function(t, n, cache)
    n = n or 0;
    cache = cache or {};
    if(nil ~= t)then
        local prefix = "";
        if(n > 0)then
            for i=1, n, 1 do
                prefix = prefix .. "  ";
            end
        end
        for k,v in pairs(t) do
            if(type(v) == "table" and not cache[tostring(v)])then
                cache[tostring(v)] = true;
                print(prefix .. tostring(k) .. ":");
                table.print(v, n+1, cache);
            else
                print(prefix .. tostring(k) .. ": " .. tostring(v) .. "(" .. type(v) .. ")");
            end
        end
    end
end

function unrequire(m)
    package.loaded[m] = nil;
    rawset(_G, m, nil);
    local registry = debug.getregistry();
    local nMatches, mKey, mt = 0, nil, registry["_LOADLIB"];
    for key, ud in pairs(registry) do
        if type(key) == string and type(ud) == userdata and getmetatable(ud) == mt and string.find(key, "LOADLIB: .*" .. m) then
            nMatches = nMatches + 1;
            if nMatches > 1 then
                return false, "More than one possible key for module " .. m .. ". Cant decide which one to erase.";
            end
            mKey = key;
        end
    end
    if mKey then
        registry[mKey] = nil;
    end
    return true;
end

local function RemovePoppedState()
	if poppedState ~= nil then
		poppedState:Exit();
		poppedState = nil;
	end
end

function PushState(stateType, ...)
    if #stateStack > 0 and stateType == stateStack[#stateStack].type then
        return;
    end

    local loadStateFirst = false;
    if stateType == BaseState.State_Loading then
        loadStateFirst = true;
        stateType = arg[1];
        for i=2, #arg do
            arg[i-1] = arg[i];
        end
    end

	local newState;
	if (stateType == BaseState.State_Login) then
		local MenuLogin = require("MenuLogin");
		newState = MenuLogin:New();
		unrequire("MenuLogin");

	elseif (stateType == BaseState.State_Main) then

		local MenuMain = require("MenuMain");

		newState = MenuMain:New();

		unrequire("MenuMain");

	else
		local MenuUserMessageInbox = require("MenuUserMessageInbox");
		newState = MenuUserMessageInbox:New();
		unrequire("MenuUserMessageInbox");
	end
	currentState = newState;
end



function ChangeState(state, ...)
	ClearStates();
	PushState(state, unpack(arg));
end