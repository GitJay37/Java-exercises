
public class Cadenas {

	public static void main(String[] args) {
		/* String is a class in Java.
		 * 
			the next examples belong to the format method:
			%s means that this assignment can replace its position with the value of a variable.
			%d means that I can add a integer number in the string result. 
			%.7f means the amount of numbers I want see as a result but its kind of data has to be a float.
			The method trim() can remove spaces at the begin from a string and at the end about it:
			System.out.printf means like a suggest will execute a format  
		*/
		String varCadena = "texto, ", varStr1 = "HI" , varStr2 = "hI", varConcat;
		String mayIni, concateC, minAll, varTrim, testVar, courseJ = "Java", varStrf, varBirth = "Birthday";
		int counterStr;
		boolean contenido, startW, endW, resStrs;
		float testNum = 14.1812206f;
		String varCadena1 = new String("      Strign text trim 3  ").trim(); //
		
		counterStr = varCadena1.length();
		System.out.println(counterStr);
		
		mayIni =  varCadena.toUpperCase().trim();
		System.out.println(mayIni);
		
		minAll = varCadena1.toLowerCase();
		System.out.println(minAll);
		
		varTrim = varCadena1.trim();
		System.out.println(varTrim);
		
		contenido = varCadena.contains("z");
		System.out.println(contenido);
		
		startW = varCadena.startsWith("h");
		System.out.println(startW);
		
		endW = varCadena.endsWith("o");
		System.out.println(endW);
		
		concateC = varCadena.concat(varCadena1);
		System.out.println(concateC);
		
		testVar = String.format(" Welcome to the course %s ", courseJ).trim();
		System.out.println(testVar);
		
		varStrf = String.format("El total de las  %d fechas son: %.7f %s", 3, testNum, varBirth);
		System.out.printf(varStrf); 
		System.out.println();
		
		resStrs = varStr1.equals(varStr2);
		System.out.println(resStrs);
		
		resStrs = varStr1.equalsIgnoreCase(varStr2);
		System.out.println(resStrs);
		
		varConcat = (varCadena + varStr1 + mayIni + minAll + varTrim + testVar + varBirth + varStrf);
		System.out.println(varConcat);
	}
}
