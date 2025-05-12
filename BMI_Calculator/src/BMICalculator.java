public class BMICalculator {

    double weightKg;
    double heightIn;
    double weightPG;
    double heightM;
    double bmi;

    public BMICalculator() {
        this.heightIn = 0.0;
        this.weightKg = 0.0;
        this.heightM = 0.0;
        this.weightPG = 0.0;
        this.bmi = 0.0;
    }

    public double calculateBmiImperial(double weightPG, double heightIn) {
        if (heightIn == 0.0 || weightPG == 0.0) {
            System.out.println("Weight or Height can not be 0.0");
            return 0;
        }
            return ( 703 * weightPG ) / ( heightIn * heightIn );

    }

    public double calculateBmiMetric(double weightKg, double heightM) {
        if (heightM == 0.0 || weightKg == 0.0) {
            System.out.println("Weight or Height can not be 0.0");
            return 0;
        }
            return weightKg / ( heightM * heightM );

    }

    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

}