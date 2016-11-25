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
end;