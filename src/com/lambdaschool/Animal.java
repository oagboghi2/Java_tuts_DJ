package com.lambdaschool;

public class Animal
{
    public static final double FAVNUMBER = 1.6180;

    private String name;
    private int weight;
    private boolean haOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    public Animal()
    {
        numberOfAnimals++;

        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers);

        int diffOfNumbers = 5 - 1;
        System.out.println("5 - 1 = " + diffOfNumbers);

        int multOfNumbers = 5 * 1;
        System.out.println("5 * 1 = " + multOfNumbers);

        int divOfNumbers = 5/1;
        System.out.println("5/1 = " + divOfNumbers);

        int modOfNumbers = 5%3;
        System.out.println("5% = " + modOfNumbers);

        // hasNextInt, hasNextFloat, hasNextDouble
        //hasNextByte

//        if(userInput.hasNextLine())
//        {
//            this.setName(userInput.nextLine());
//        }


    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public boolean isHaOwner()
    {
        return haOwner;
    }

    public void setHaOwner(boolean haOwner)
    {
        this.haOwner = haOwner;
    }

    public byte getAge()
    {
        return age;
    }

    public void setAge(byte age)
    {
        this.age = age;
    }

    public long getUniqueID()
    {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID)
    {
        this.uniqueID = uniqueID;
    }

    public char getFavoriteChar()
    {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar)
    {
        this.favoriteChar = favoriteChar;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }



    protected static void countTo(int startingNumber)
    {
        for (int i = startingNumber; i <= 100; i++)
        {
            if(i == 90) continue;

            System.out.println(i);
        }
    }

    protected static String printNumbers(int maxNumbers)
    {
        int i = 1;
        while(i < (maxNumbers / 2)){
            System.out.println(i);
            i++;

            if(i == (maxNumbers/2)) break;
        }
        Animal.countTo(maxNumbers/2);
        return "End of printNumbers";
    }

//    protected static void guessMyNumber(){
//        int number;
//
//        do{
//            System.out.println("Guess number up to 100");
//
//            while(!userInput.hasNextInput())
//            {
//
//                String numberEntered = userInput.next();
//                System.out.println("%s is not a number\n", numberEntered);
//            }
//            number = userInput.nextInt();
//        }
//        while(number != 50)
//    }

    public String makeSound()
    {
        return "Grrrr";
    }

    public static void speakAnimal(Animal randAnimal)
    {
        System.out.println("Animal says " + randAnimal.makeSound() );
    }


}
