package src;

public class Select {

    public void selectMonth(String choiceLanguage, int choiceMonth){
        switch (choiceLanguage){
        //if(choiceLanguage == "angielski" || choiceLanguage == "english"){
            case "ENG":
            switch (choiceMonth) {
                case 1:
                    System.out.println(Months.JANUARY);
                    break;
                case 2:
                    System.out.println(Months.FEBRUARY);
                    break;
                case 3:
                    System.out.println(Months.MARCH);
                    break;
                case 4:
                    System.out.println(Months.APRIL);
                    break;
                case 5:
                    System.out.println(Months.MAY);
                    break;
                case 6:
                    System.out.println(Months.JUNE);
                    break;
                case 7:
                    System.out.println(Months.JULY);
                    break;
                case 8:
                    System.out.println(Months.AUGUST);
                    break;
                case 9:
                    System.out.println(Months.SEPTEMBER);
                    break;
                case 10:
                    System.out.println(Months.OCTOBER);
                    break;
                case 11:
                    System.out.println(Months.NOVEMBER);
                    break;
                case 12:
                    System.out.println(Months.DECEMBER);
                    break;
                default:
                    System.out.println("Podano zły numer");
                    break;
            }
            break;
            case "POL":
                switch (choiceMonth) {
                    case 1:
                        System.out.println(Months.JANUARY.getPolish());
                        break;
                    case 2:
                        System.out.println(Months.FEBRUARY.getPolish());
                        break;
                    case 3:
                        System.out.println(Months.MARCH.getPolish());
                        break;
                    case 4:
                        System.out.println(Months.APRIL.getPolish());
                        break;
                    case 5:
                        System.out.println(Months.MAY.getPolish());
                        break;
                    case 6:
                        System.out.println(Months.JUNE.getPolish());
                        break;
                    case 7:
                        System.out.println(Months.JULY.getPolish());
                        break;
                    case 8:
                        System.out.println(Months.AUGUST.getPolish());
                        break;
                    case 9:
                        System.out.println(Months.SEPTEMBER.getPolish());
                        break;
                    case 10:
                        System.out.println(Months.OCTOBER.getPolish());
                        break;
                    case 11:
                        System.out.println(Months.NOVEMBER.getPolish());
                        break;
                    case 12:
                        System.out.println(Months.DECEMBER.getPolish());
                        break;
                    default:
                        System.out.println("Podano zły numer");
                        break;
                }
                break;
            default:
                System.out.println("Brak takiego języka do wyboru");
                break;
        }

    }
}
