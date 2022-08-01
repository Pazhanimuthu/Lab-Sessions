/*
@author : Pazhani Muthu
Title : 3Movie collections.
Qns: Which movie is highest collection? */

class CompareEntertainments1
{
    public static void main(String arg[])
    {
        Movie KGF2 = new Movie();
        KGF2.name = "KGF2";
        KGF2.director = "Prashanth Neel";
        KGF2.stuntMaster = "Anbariv";
        KGF2.numberOfArtists = 57;
        KGF2.releaseDate = "14-April-2022";
        
        KGF2.collectionsFirstWeek = 450;
        KGF2.collectionsRestOfTheDays =2100 ;
        
        Movie1 RRR = new Movie1();
        RRR.name = "RRR";
        RRR.director = "Rajamouli";
        RRR.stuntmaster = "Nick Powell";
        RRR.numberOfArtists = 45;
        RRR.releaseDate = "24-Mar-2022";
        
        RRR.collectionsFirstWeek = 110;
        RRR.collectionsRestOfTheDays = 1250;
        
        
        Movie2 Vikram = new Movie2();
        Vikram.name = "VIKRAM";
        Vikram.stuntmaster = "Anbariv";
        Vikram.numberOfArtists = 78;
        Vikram.releaseDate = "03-Jun-2022";
        
        Vikram.collectionsFirstWeek = 168;
        Vikram.collectionsRestOfTheDays = 407;
        
                   //575                >    2550                      &&   575                     >           1360
        if((Vikram.getTotalCollections() > KGF2.getTotalCollections()) && (Vikram.getTotalCollections() > RRR.getTotalCollections()))
                    //TRUE                                             &&           TRUE =====>  TRUE
        {
            Vikram.print();
        }
        else if ( KGF2.getTotalCollections() > RRR.getTotalCollections())
        {
            KGF2.print();
        }
        else
        {
            RRR.print();
        }
    
    }
}

class Movie
{
    String name;
    String director;
    String stuntMaster;
    int numberOfArtists;
    String releaseDate;
    double collectionsFirstWeek;
    double collectionsRestOfTheDays;

    double getTotalCollections()
    {
        return collectionsFirstWeek + collectionsRestOfTheDays;
    }

    void print()
    {
        System.out.println( name + " got the following collections " );
        System.out.println("First Week : " + collectionsFirstWeek);
        System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
        System.out.println("Total Collections : " + getTotalCollections());
        System.out.println("Total Actors : " + numberOfArtists);
        System.out.println("Release Date : " + releaseDate);
        System.out.println("Director : " + director);
        System.out.println("Stunt Master : " + stuntMaster);
    }
}

class Movie1
{
    String name;
    String director;
    String stuntmaster;
    int numberOfArtists;
    String releaseDate;
    double collectionsFirstWeek;
    double collectionsRestOfTheDays;

    double getTotalCollections()
    {
        return collectionsFirstWeek + collectionsRestOfTheDays;
    }

    void print()
    {
        System.out.println( name + " got the following collections " );
        System.out.println("First Week : " + collectionsFirstWeek);
        System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
        System.out.println("Total Collections : " + getTotalCollections());
        System.out.println("Total Actors : " + numberOfArtists);
        System.out.println("Release Date : " + releaseDate);
        System.out.println("Writer : " + director);
        System.out.println("Stage Setter : " + stuntmaster);
    }
}

class Movie2
{
    String name;
    String stuntmaster;
    int numberOfArtists;
    String releaseDate;

    double collectionsFirstWeek;
    double collectionsRestOfTheDays;

    double getTotalCollections()
    {
        return collectionsFirstWeek + collectionsRestOfTheDays;
    }

    void print()
    {
        System.out.println( name + " got the following collections " );
        System.out.println("First Week : " + collectionsFirstWeek);
        System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
        System.out.println("Total Collections : " + getTotalCollections());
        System.out.println("Total Actors : " + numberOfArtists);
        System.out.println("Release Date : " + releaseDate);
        System.out.println("Ring Master : " + stuntmaster);
    }
}