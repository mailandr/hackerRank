package codingCampus.Selbstkontrolle;

public class AufgabeStringManipulation1 {
    public static void main(String[] args) {
        String text = "Marie Skłodowska Curie (* 7. November 1867 in Warschau, Russisches Kaiserreich; † 4. Juli 1934 bei Passy, geborene Maria Salomea Skłodowska) war eine Physikerin und Chemikerin polnischer Herkunft, die in Frankreich lebte und wirkte. Sie untersuchte die 1896 von Henri Becquerel beobachtete Strahlung von Uranverbindungen und prägte für diese das Wort „radioaktiv“. Im Rahmen ihrer Forschungen, für die ihr 1903 ein anteiliger Nobelpreis für Physik und 1911 der Nobelpreis für Chemie zugesprochen wurde, entdeckte sie gemeinsam mit ihrem Ehemann Pierre Curie die chemischen Elemente Polonium und Radium. Marie Curie ist die einzige Frau unter den vier Personen, denen bisher mehrfach ein Nobelpreis verliehen wurde, und neben Linus Pauling die einzige Person, die Nobelpreise auf zwei unterschiedlichen Fachgebieten erhielt.";

        String text2 = text.replaceAll("[a-c]", "X");
        String text3 = text2.replaceAll("[f-z]", "Y");
        String text4 = text3.replaceAll("[1-5]","a");
        String text5 = text4.replaceAll("[4-9]","b");
        System.out.println(text5);
    }
}
