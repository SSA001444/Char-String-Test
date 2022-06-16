import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int punkts = 0;
    int atbl;
    Scanner scan = new Scanner(System.in);
    System.out.println("Sveiki! Šis ir tests, lai pārbaudītu zināšanas par simboliem un simboliem virknēm. Test sastāv no 10 jautājumiem.\n\n");

    System.out.println("\n1. Ko jūs attēlojat zem mainīgā, kas saglabā simboli un simbolas virkni?\n 1.String | int\n 2. String | char\n 3.char | String\n 4.char | double\n\n");
    atbl = scan.nextInt();
    if(atbl == 3)
      punkts++;
    System.out.println("\n2. Ja jums ir jāievada unikods char, ko jūs izmantosit?\n 1.char a = 0041\n 2.char a = 41\n 3.char a = \\u0041 \n 4.char a = '\\u0041'\n\n");
    atbl = scan.nextInt();
      if(atbl == 4)
      punkts++;
     System.out.println("\n3. Kā uzzināt simbola Unicode ar String?\n 1.codePointAt()\n 2. Nav iespējams\n 3.(int)String\n 4. 1. un 3. pareizi\n\n");
     atbl = scan.nextInt();
      if(atbl == 1)
      punkts++;
    System.out.println("\n4. Ka parbaudē ir tas simbols(i) String vai ne?\n 1.Meklēt paši\n 2. Nav iespējams\n 3.contains()\n 4.indexOf()\n\n");
         atbl = scan.nextInt();
      if(atbl == 3)
      punkts++;
    System.out.println("\n5. Ka uzzināt index simbola String?\n 1.Meklēt paši\n 2.lastIndeOf()\n 3. 2. un 4. pareizi\n 4.indexOf()\n\n");
         atbl = scan.nextInt();
      if(atbl == 3)
      punkts++;
    System.out.println("\n6. Ko funkcija isEmpty() dara?\n 1.Notīra viss String\n 2.Pārbauda,vai String tukšuma\n 3. Šī funkcija neeksistē\n 4.Šeit nav pareizas atbildes\n\n");
         atbl = scan.nextInt();
      if(atbl == 2)
      punkts++; 
    System.out.println("\n7. Ko funkcija isDigit() dara?\n 1.Pārbauda,va ir skaitlis String\n 2.Pārbauda,vai ir skaitlis char\n 3. Šī funkcija neeksistē\n 4.Šeit nav pareizas atbildes\n\n");
       atbl = scan.nextInt();
      if(atbl == 2)
      punkts++; 
    System.out.println("\n8. Ko funkcija toLowerCase() dara?\n 1.Pārbauda,vai tas ir mazāka reģistrēties\n 2.Pārbauda,vai tas ir lielāka reģistrēties\n 3. Maiņa reģistrēties uz mazāko \n 4.Maiņa reģistrēties uz lielāko\n\n");
      atbl = scan.nextInt();
      if(atbl == 3)
      punkts++; 
     System.out.println("\n9.Kā savienot divas virknes?\n 1.split()\n 2.contains()\n 3.compareTo\n 4.concat()\n\n");
      atbl = scan.nextInt();
      if(atbl == 4)
      punkts++; 
     System.out.println("\n10.Kā sadalīt divas virknes?\n 1.split()\n 2.contains()\n 3.compareTo\n 4.concat()\n\n");
      atbl = scan.nextInt();
      if(atbl == 1)
      punkts++; 
  }
}