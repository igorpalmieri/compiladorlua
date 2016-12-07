local AND = "android";
local IOS = "ios";
local WIN = "windows";


local deviceIsIPad = false;


currentState = nil;

local previousStateType = 0;
local currentStateType = 0;
local refreshUserStats = false;
local lastTime = 0;
local poppedState;
local resumingStates = false;
local resumeScreen;
local MaxElapsedTime = 0.04;        	--This number represents 20 FPS. If we dip below that, don"t freak out.
local MaxTimeToResume = 60 * 60 * 8;	--How long we should wait before restarting at the splash screen
n = 1 or 0;
if(nil ~= t)then
	local prefix = "kla";   
end