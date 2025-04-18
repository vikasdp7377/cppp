package day4_String_builder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("hello Everyone ");
		builder.append("my name is ");
		builder.append("Vikas Dawange. ");
		builder.append("My weight is ");
		builder.append(60.50f);
		System.out.println(builder);
		builder.append(", my vaccination status is ");
		builder.append(true);
		String details = builder.toString();
		
		System.out.println(details);

	}

}
