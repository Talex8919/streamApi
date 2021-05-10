package kg.megacome.course;


import kg.megacome.course.enums.EnumsType;

import kg.megacome.course.enums.Gender;
import kg.megacome.course.zoo.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	LocalDate allisterB= LocalDate.of(2020, Month.FEBRUARY,15);
        LocalDate variusB= LocalDate.of(2019, Month.MAY,16);
        LocalDate boskoB= LocalDate.of(2019, Month.OCTOBER,14);
        LocalDate hecktorB= LocalDate.of(2020, Month.FEBRUARY,28);
        LocalDate miloB= LocalDate.of(2015, Month.MARCH,13);
        LocalDate archieBs= LocalDate.of(2019, Month.MARCH,20);
        LocalDate ollieBs= LocalDate.of(2019, Month.OCTOBER,20);
        LocalDate tobyB= LocalDate.of(2019, Month.OCTOBER,25);
        LocalDate growslB = LocalDate.of(2019, Month.FEBRUARY,20);
LocalDate jackB=LocalDate.of(2019, Month.DECEMBER,19);
        LocalDate juniorB = LocalDate.of(2015, Month.MARCH,11);
        LocalDate browlsB= LocalDate.of(2019, Month.MARCH,24);
        Cat allister = new Cat("Cornish Rex Cat","Allister",1,25000,false,
                    true,true,allisterB,true,EnumsType.EXOTIC, Gender.FEMALE);
            Cat varius= new Cat("European Burmese", "Varius",2,15000,
                    false,true, true,variusB,true,EnumsType.EXOTIC,Gender.MALE );
        Cat bosko= new Cat("Havana Brown ", "bosko",1,25000,
                false,true, true,boskoB,true,EnumsType.EXOTIC,Gender.FEMALE );
        Cat hecktor= new Cat("Japanese Bobtail ", "Hecktor",5,10000,
                true,true, false,hecktorB,true,EnumsType.NONE_EXOTIC,Gender.MALE );
        Dog milo= new Dog("Basset Hound ", "Milo",6,2000,
                false,true, false,miloB,true,EnumsType.EXOTIC, Gender.FEMALE );
        Dog archie= new Dog("Boston Terrier", "Archie",1,7500,
                false,true, true,archieBs,true,EnumsType.EXOTIC,Gender.MALE);
        Dog ollie= new Dog("Alaskan Malamute", "Ollie",1,15000,
                false,false, true,ollieBs,true,EnumsType.NONE_EXOTIC,Gender.MALE );
        Dog toby= new Dog("Malinois", "Toby",2,10000,
        false,true, true,tobyB,true,EnumsType.EXOTIC,Gender.FEMALE );
        Dog moby= new Dog("Malinois", "moby",1,12000,
                false,true, true,tobyB,false,EnumsType.NONE_EXOTIC,Gender.MALE );
        Parrot growsley= new Parrot("Blue Crowned Parakeet", "growsley",1,10500,
                false,true, true,growslB,false,EnumsType.NONE_EXOTIC ,Gender.MALE);
        Parrot jack= new Parrot("Australian King Parrot", "Jack",6,2000,
                false,true, false,jackB,true,EnumsType.NONE_EXOTIC,Gender.FEMALE );
        Parrot junior= new Parrot("Blue Naped Parrot", "Junior",5,1500,
                true,false, true,juniorB,false, EnumsType.ABANDON ,Gender.MALE);
        Parrot browls= new Parrot("Blue Crowned Racquet Tail", "Browls",1,35000,
                false,false, true,browlsB,true,EnumsType.NONE_EXOTIC,Gender.FEMALE );
        Snake bella= new Snake("Smooth Green Snake  ", "Bella",6,15400,
                false,true, false,miloB,true,EnumsType.EXOTIC,Gender.MALE );
        Snake molly= new Snake("Ringneck Snake", "molly",1,23500,
                false,true, true,archieBs,true,EnumsType.EXOTIC,Gender.MALE );
        Snake coco= new Snake("Rainbow Boa", "coco",1,32562,
                false,false, true,ollieBs,true,EnumsType.EXOTIC,Gender.FEMALE );
        Snake frankie= new Snake("Dekay's Brown Snake", "frankie",1,25458,
                false,true, true,tobyB,true,EnumsType.EXOTIC,Gender.FEMALE );
        Spider luna= new Spider("Tarantulas  ", "Luna",6,20520,
                false,true, false,miloB,true,EnumsType.EXOTIC,Gender.FEMALE );
        Spider bolls= new Spider("Jumping Spiders", "bolls",1,25400,
                false,true, true,archieBs,false,EnumsType.EXOTIC,Gender.MALE );
        Spider jaja= new Spider("Fishing Spiders", "jaja",1,32332,
                false,false, true,ollieBs,false,EnumsType.EXOTIC,Gender.FEMALE );
        Spider gigs= new Spider("Grass Spiders", "gigs",1,25456,
                false,true, true,tobyB,false,EnumsType.EXOTIC,Gender.FEMALE );

        Spider ura= new Spider("Tarantulabra Spider  ", "uRA",6,15365,
                false,true, false,miloB,true,EnumsType.EXOTIC,Gender.FEMALE );
        Spider bolalas= new Spider("Jumping brown Spiders", "bolalas",1,15965,
                false,true, true,archieBs,false,EnumsType.EXOTIC,Gender.MALE );
        Spider kasas= new Spider("Hunting Spiders", "kasas",1,18548,
                false,false, true,ollieBs,false,EnumsType.EXOTIC,Gender.FEMALE );
        Spider gasdc1= new Spider("Grass yellow Spiders", "gasdc",1,10528,
                false,true, true,tobyB,false,EnumsType.EXOTIC,Gender.MALE );
        Spider gasdc2= new Spider("Grass yellow Spiders", "gasdc",1,10528,
                false,true, true,tobyB,false,EnumsType.EXOTIC,Gender.MALE );
        Spider gasdc3= new Spider("Grass yellow Spiders", "gasdc",1,10528,
                false,true, true,tobyB,false,EnumsType.EXOTIC,Gender.MALE );
        Spider gasdc4= new Spider("Grass yellow Spiders", "gasdc",1,10528,
                false,true, true,tobyB,false,EnumsType.EXOTIC,Gender.MALE );



        ArrayList<Cat>catsArrayList = new ArrayList<>();
        catsArrayList.add(allister);
        catsArrayList.add(varius);
        catsArrayList.add(bosko);
        catsArrayList.add(hecktor);
        System.out.println("Lambda and Filter = price 15000");
        List<Cat> catsList=catsArrayList.stream()
                .filter(m-> m.getPrice()>15000)
                .collect(Collectors.toList());
        System.out.println(catsList);
        System.out.println("count of  positions which costs more than 15000");
        System.out.println(catsList.stream()
                .filter(m-> m.getPrice()>15000)
        .count());
        System.out.println();
        System.out.println("count posotions of words that start  from  word  h ");
        long count =catsArrayList
                .stream()
                .filter(m->m.getBreedName().
                        toLowerCase()
                        .startsWith("h"))
                .distinct()
                .count();
        System.out.println(count);

   ArrayList<Dog>dogsArrayList= new ArrayList<>();
        dogsArrayList.add(milo);
   dogsArrayList.add(archie);
   dogsArrayList.add(ollie);
   dogsArrayList.add(toby);
   dogsArrayList.add(moby);

       ///dogsArrayList.stream()
//                .filter(dogs-> dogs.getPrice()>7000 && dogs.getDogG()== Gender.MALE)
  ///              .collect(Collectors.toCollection());System.out.println( dogsArrayList);

        ArrayList<Parrot> parrotArrayList= new ArrayList<>();
        parrotArrayList.add(growsley);
        parrotArrayList.add(jack);
        parrotArrayList.add(junior);
        parrotArrayList.add(browls);
        System.out.println( "Using Map Multiple the price  in 3  per  parrot");
        List<Integer> parrotArrayList1= parrotArrayList.stream()
                .map (s-> s.getPrice() *3)
                .collect(Collectors.toList());
        System.out.println( parrotArrayList1);

Bonuses silver= new Bonuses("Pet Snacks", 2);
        Bonuses gold= new Bonuses("Pet Snacks", 10);
        Bonuses platinum= new Bonuses("Pet Snacks", 20);

        ArrayList<Snake>snakesArrayList= new ArrayList<>();
        snakesArrayList.add(bella);
                snakesArrayList.add(molly);
        snakesArrayList.add(coco);
                snakesArrayList.add(frankie);
        System.out.println("making  complex map with  If");

        List<Bonuses> bonusesList= snakesArrayList.stream()
                .map(snakes-> { if (snakes.getPrice()<=16000){
                    return silver;}
                else if (snakes.getPrice()<=26000){
                    return gold;}
                else {
                    return platinum;
                        }

                }
                ).collect(Collectors.toList());
        System.out.println(bonusesList);
        System.out.println();
        System.out.println();
        ArrayList<Spider>spiderArrayList= new ArrayList<>();

        spiderArrayList.add(luna);
        spiderArrayList.add(bolls);
        spiderArrayList.add(jaja);
        spiderArrayList.add(gigs);
        spiderArrayList.add(ura);
        spiderArrayList.add(bolalas);
        spiderArrayList.add(kasas);
        spiderArrayList.add(gasdc1);
        spiderArrayList.add(gasdc2);
        spiderArrayList.add(gasdc3);
        spiderArrayList.add(gasdc4);


        System.out.println();
        System.out.println( " Spider list there are 8 spiders");
         spiderArrayList
                 .stream()
                .skip(5)
                 .forEach(System.out::println);
        System.out.println();
        System.out.println("Then DO a Limitation of 4, the number of list  is the same");

        spiderArrayList
                .stream()
                .limit(4)
                .forEach(ss->{
                    System.out.println( ss); });
        System.out.println();
        System.out.println("Printing Skip and limit  at  the same time ");
        int page =2;
        int pageSize=3;

        spiderArrayList
                .stream()
                .skip( (page -1)*pageSize)
                .limit(pageSize)
                .forEach(System.out::println);
        System.out.println();

        System.out.println(" Using Distinct");
        spiderArrayList
                .stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Using Peek");
        dogsArrayList.stream()
                .distinct()
                .peek(System.out::println)
                .peek(s->{
                    System.out.println("-------");
                })
.filter(s-> s.getPrice()>10000)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Sorted boolean");
        dogsArrayList
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Comparator through  class ");
        Comparator<Dog>dogComparator = (Comparator)(o1,o2) ->{
                Dog dog1= (Dog)o1;
        Dog dog2= (Dog)o2;
        return ((Dog) o2).getPrice()- ((Dog)o1).getPrice();};
        System.out.println();
        dogsArrayList
                .stream()
                .sorted(dogComparator)
                .forEach(System.out::println);

long countDogs = dogsArrayList
        .stream()
        .count();
        System.out.println(countDogs);

        boolean  match = dogsArrayList
                .stream()
                .noneMatch(dogs -> dogs.getPrice()<2000);
        System.out.println(match);


        boolean matchAll = dogsArrayList
                .stream()
                .allMatch(dogs-> dogs.getPrice()<30000);
        System.out.println(matchAll);

        Optional<Dog>dogs= dogsArrayList
                .stream()
                .findFirst();
        System.out.println(dogs);

    Optional<Dog>doggy= dogsArrayList
            .stream()
           .findFirst();
            Dog normaDog= doggy.get();
        System.out.println(normaDog);

        System.out.println( "____________");
        Optional<Dog>doggY= dogsArrayList
                .stream().filter(dog-> dog.getBreedName().startsWith("Basset Hound"))
                .findFirst();
        Dog filteredDOg = doggY.get();
        System.out.println(doggY);
        System.out.println( "______________");
        Dog anyDog = dogsArrayList
                .stream()
                .findAny()
                .get();
        System.out.println(anyDog);

        System.out.println( " Complex ___ 49-53");

      long countSpider= spiderArrayList
              .stream()
              .filter (spiderss-> spiderss.getPrice()<= 16000)
              .filter(spidera-> spidera.getNickName().startsWith("g"))
              .count();
        System.out.println(countSpider);

    }



    }



