package lh.monika;

public class Main {

    public static void main(String[] args) {
	DataGenerator dataGenerator = new DataGenerator();
	FormData generatedData = dataGenerator.generate();
	System.out.println(generatedData.firstName);
	System.out.println(generatedData.lastName);
	System.out.println(generatedData.country);
	System.out.println(generatedData.stateProvince);
	System.out.println(generatedData.emailAddress);
	System.out.println(generatedData.password);
	System.out.println(generatedData.password);
    }
}
