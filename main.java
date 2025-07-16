public class Main {
    public static void main(String[] args) {
        System.out.println();
        int currentYear = 2024;

        patient chatchai = new patient(1000, "Chatchai Saemhatai", 1987,  176,  67, "A", "081-8608977");
        chatchai.details(currentYear);

        // Test valid patient
        patient validPt = new patient(1001, "John Doe", 1978, 175.5, 78.0, "AB", "085-744-1032");
        validPt.details(currentYear);

        // Test invalid patient (height)
        patient invalidPt = new patient(1002, "Joe Dohn", 1990, -160.0, -65.0, "O", "088-175-1188");
        invalidPt.details(currentYear);

        // Test invalid patient (age&bloodGroup)
        patient timetraveler = new patient(1003, "Chris K.", 2033, 187.5, 78.0, "m", "088-725-7880");
        timetraveler.details(currentYear);
    }
}
//patient chatchai = new patient(1000, "Chatchai Saemhatai", 1987,  176,  67, "A",  "081-8608977");
