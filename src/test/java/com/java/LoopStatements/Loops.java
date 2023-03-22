package com.java.LoopStatements;

public class Loops {

    int  i= 8, j= 8;
    public void display(int a, int b){  // parameterized method


        System.out.println("this is a for loop..............................");

        for( a=1;a<=5;a++){
            for(b=1;b<=a;b++){
                System.out.print(b);
            }
            System.out.println();//new line
        }

        System.out.println("this is a while loop..............................");

        while (a <=10)
        {
            System.out.println(a);
            a++;
        }

        System.out.println("this is a do while loop..............................");
        do
        {
          System.out.println(b);
           b++;
        }
        while (b<=10);



        System.out.println("This is a jump(continue statement).....................");
        for( i=1;i<=10;i++){
            for(j=1;j<=i;j++){
                if (j<3)
                {
                    continue; //continues after 3
                }
                System.out.print(j);
            }
            System.out.println();//new line
        }


        System.out.println("This is a jump(break statement).....................");
        for( i=1;i<=5;i++) {   // here program runs 5 times and it breaks when get the value of j is 5.
            for(j=1;j<=i;j++){
                if (j==5)
                {
                    break; //continues after 3
                }
                System.out.print(j);
            }
            System.out.println();//new line
        }

    }

    public Loops() {    // constructor

        System.out.println("This is a for each loop.....................");
        int number []={12,13,14,15};

        for(int i:number){
            System.out.println(i);
        }

    }


    public static void main(String[] args)
    {
        Loops obj1 = new Loops();
        obj1.display(5, 5);

        System.out.println("Decision Making statements-------------------------------");
        int age=20;
        //checking the age
        if(age>18){
            System.out.println("This is a valid voter");

        }

        int pass=33;
        if (pass<40){
            System.out.println("He Fail the Exam");
        }
        else
        {
           System.out.println("He get the pass marks");
        }

        if (pass<33){
            System.out.println("He Fail the Exam");
        }
        else if (pass==33)
        {
            System.out.println("He get the pass marks");
        }
        else
        {
            System.out.println("He get a good mark ");

        }

        if (pass>50)   //nested if else
        {
            if (pass==40)
                System.out.println("The pass marks is: "+pass);
        }
        else
        {
            System.out.println("He get more than pass marks");
        }

    }



}



