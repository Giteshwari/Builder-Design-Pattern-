package DailyAssignments.FacadePattern;

public class VaccinationSimplified {
    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        vaccination.doingVaccinationWithCoviShield();
        vaccination.doingVaccinationWithCovaxin();
        vaccination.doingVaccinationWithCorbevax();
    }
}
