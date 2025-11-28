class updatedswitch{
    public static void main( String[] args){
        String day = "Dashain";
        String food = "";
        food = switch(day){
            case "Dashain", "Chaitra Dashain" -> "Masu_bhat";
            case "Tihar"-> "Sail roti";
            default -> "Sadha_khana";
        };
        System.out.print("The day is "+(day) +" and food is "+ (food));
    }
}
// here in updated switch we don;t have to use break; statement it is done by ->
// and important we can used switch as expression in order to get return value 
// another interesting thing is we can pass multiple string values too 