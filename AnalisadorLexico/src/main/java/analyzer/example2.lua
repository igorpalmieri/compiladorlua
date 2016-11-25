--
-- Solving of the quadratic equation: ax^2 + bx + c =0
--

text = "";
a = 2.0;
b = 1.0;
c = -2.0;

print( "\nEquation " .. a .. "x^2 + " .. b .. "x +
       " .. c .. " = 0\n" );

-- 1)  Determinant calculus
--
delta = b*b - (4 * a * c );

-- 2)  Solutions depending on the determinant
--
if( delta<0 ) then
	text = "There is no real solution.";
elseif( delta == 0 ) then
	x = b / (2 * a);
	text = "There is one real solution: x=" .. x;
else
	x1 = (b + math.sqrt(delta)) / (2*a);
	x2 = (b - math.sqrt(delta)) / (2*a);
	text = "There are two real solutions: x1=" .. x1 .. " 
	       et x2=" .. x2;
end

print( text );