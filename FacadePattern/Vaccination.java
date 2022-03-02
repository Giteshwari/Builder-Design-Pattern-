package DailyAssignments.FacadePattern;
class Vaccination {
    CoviShield coviShield;
    Corbevax corbevax;
    Covaxin covaxin;

    Vaccination() {
        coviShield = new CoviShield();
        corbevax = new Corbevax();
        covaxin = new Covaxin();
    }

    void doingVaccinationWithCoviShield() {
        coviShield.vaccinatedWith();
    }

    void doingVaccinationWithCorbevax() {
        corbevax.vaccinatedWith();
    }

    void doingVaccinationWithCovaxin() {
        covaxin.vaccinatedWith();
    }
}
