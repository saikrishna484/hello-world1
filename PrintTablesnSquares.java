class PrintTablesnSquares{
void printTable(int number){
for(int j=1;j<=number;j++){
for (int i=1;i<=10;i++){
System.out.printf(" %d * %d = %d", j , i , j*i).println();
}
System.out.println("\n");
}
}
void printSquare(int number){
for(int k=1;k<=number;k++){
System.out.println(k*k);
}
}
public static void main(String[] args){
PrintTablesnSquares PrintTables1nSquares1= new PrintTablesnSquares();
PrintTables1nSquares1.printTable(5);
PrintTables1nSquares1.printSquare(5);
}
}
