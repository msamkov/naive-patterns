package ru.max.naivepatterns.gof.creational.builder;

/**
 * Используется для создания сложного объекта с использованием простых объектов.
 * Постепенно он создает больший объект
 * от малого и простого объекта. Позволяет изменять внутреннее представление конечного продукта.
 *
 *  Пример из Java:
 * 		StringBuilder builder = new StringBuilder();
 * 		builder.append("This is an example ");
 * 		builder.append("of the builder pattern. ");
 * 		builder.append("It has methods to append ");
 * 		builder.append("almost anything we want to a String. ");
 * 		builder.append(42);
 * 		System.out.println(builder.toString());
 */
public class BankAccount {

    private final String name;
    private final String accountNumber;
    private final String email;
    private final boolean newsletter;

    public BankAccount(BankAccountBuilder bankAccountBuilder) {
        name = bankAccountBuilder.name;
        accountNumber = bankAccountBuilder.accountNumber;
        email = bankAccountBuilder.email;
        newsletter = bankAccountBuilder.newsletter;

    }

    public static class BankAccountBuilder {

        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
