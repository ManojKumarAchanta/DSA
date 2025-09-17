package EnumExamples;

public class Basic {
    enum Week{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;
//        this is not public or protected this is only private or default
//        we dont want to creatw new objects
//        this is not the enum concept
         Week(){
            System.out.println("Constructor called : "+this);
        }
    //these are enum constants
        //these are public static final
//        since these are final we cannot create child enums
    }

    public static void main(String[] args) {
        Week week = null;
        week = week.Monday;
        for(Week day:Week.values()){
            System.out.println(day);
        }
        System.out.println(week.valueOf("Thursday"));
        System.out.println(week.ordinal());
    }
}
