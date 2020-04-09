public class StringMonth {
    public static void main(String[] args) {
        String []   Month = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        };
        String result ="";

        for (int i=0; i<Month.length;i++){
            result = result+ Month[i];
            if (i!=Month.length-1) {result = result + ", ";}
            else {result = result + ".";}

        }
        System.out.println(result);
    }
}
