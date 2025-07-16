public class patient {
    private int id;        // patient's ID
    private String name;   // patient's full name
    private int birthYear; // patient's year of birth (CE)
    private double height; // patient's height in centimeters
    private double weight; // patient's weight in kilograms
    private String bloodGroup;
    private String phoneNumber;

    public patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        // TODO: Initialize fields with validation
        // Consider: What makes a valid birthYear?
        // What are valid ranges for height and weight?
        this.id = id;
        this.name = name;
        if (birthYear >= 1900 && birthYear <= 2025)
            this.birthYear = birthYear;
        else
            System.out.println("Invalid. Using default (2000) or you're time traveler?");
        this.birthYear = 2000;

        if(height >= 30 && height <= 300) {
            this.height = height;
        } else {
            System.out.println("Invalid height. Using default (160.0 cm).");
            this.height = 160.0;
        }

        if(weight >= 0.5 && weight <= 500) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight. Using default (60.0 kg).");
            this.weight = 60.0;
        }

        if (bloodGroup.equalsIgnoreCase("A") || bloodGroup.equalsIgnoreCase("B") ||
                bloodGroup.equalsIgnoreCase("O") || bloodGroup.equalsIgnoreCase("AB") ||
                bloodGroup.equalsIgnoreCase("a") || bloodGroup.equalsIgnoreCase("b") ||
                bloodGroup.equalsIgnoreCase("c") || bloodGroup.equalsIgnoreCase("ab")) {
            this.bloodGroup = bloodGroup;
        } else {
            System.out.println("Invalid input: blood group must be A, B, O, or AB.");
            this.bloodGroup = "Unknown";
        }

        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWeight() {
        return this.weight;
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getAge(int currentYear) {
        if (currentYear >= birthYear) {
            return currentYear - birthYear;
        } else {
            System.out.println("Invalid current year.");
            return 0;
        }
    }
    public double getBMI() {
        double heightInM = this.height / 100.0;
        return this.weight / (heightInM * heightInM);
    }
        public void details(int currentYear) {
            System.out.println("Patient Name: " + this.name);
            System.out.println("Patient Age: " + getAge(currentYear));
            System.out.println("Patient Height (cm) : " + this.height);
            System.out.println("Patient Weight (kg) : " + this.weight);
            System.out.println("Patient Blood Group: " + this.bloodGroup);
            System.out.println("Patient Phone Number: " + this.phoneNumber);
            System.out.printf("Patient BMI: %.2f%n", getBMI());
            System.out.println("--------------------------------");
        }
    }
