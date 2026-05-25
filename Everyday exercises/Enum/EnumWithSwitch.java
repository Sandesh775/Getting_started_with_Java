public class EnumWithSwitch {
    enum NepaliMonths {
        BAISAKH,
        JESTHA,
        ASHADH,
        SHRAWAN,
        BHADRA,
        ASHWIN,
        KARTIK,
        MANSIR,
        POUSH,
        MAGH,
        FALGUN,
        CHAITRA;

        //Display names in Devanagari
        public String getNepaliName() {
            return switch (this) {
                case BAISAKH -> "बैशाख";
                case JESTHA -> "जेठ";
                case ASHADH -> "असाढ";
                case SHRAWAN -> "साउन";
                case BHADRA -> "भदौ";
                case ASHWIN -> "असोज";
                case KARTIK -> "कार्तिक";
                case MANSIR -> "मंसिर";
                case POUSH -> "पौष";
                case MAGH -> "माघ";
                case FALGUN -> "फागुन";
                case CHAITRA -> "चैत्र";
            };
        }

        public static void main(String[] args) {
            NepaliMonths lastMonth;
            lastMonth = NepaliMonths.CHAITRA;
            System.out.println(lastMonth);
            // display it's nepali name :
            System.out.println(lastMonth.getNepaliName());
        }
    }
}