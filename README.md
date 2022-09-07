### Типы паттернов:
* порождающие
* структурные
* поведенческие  
https://springframework.guru/gang-of-four-design-patterns/  
https://habr.com/ru/post/210288/

#### Examples of GoF Design Patterns in Java's core libraries
https://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries


#### Creational Порождающие
* +Singleton (Одиночка) - ограничивает создание одного экземпляра класса, обеспечивает доступ к его единственному объекту.
* +Factory (Фабрика) - используется, когда у нас есть суперкласс с несколькими подклассами и на основе ввода, нам нужно вернуть один из подкласса.
* +Abstract Factory (Абстрактная фабрика) - используем супер фабрику для создания фабрики, затем используем созданную фабрику для создания объектов.
* +Builder (Строитель) - используется для создания сложного объекта с использованием простых объектов. Постепенно он создает больший объект от малого и простого объекта.
* +Prototype (Прототип) - помогает создать дублированный объект с лучшей производительностью, вместо нового создается возвращаемый клон существующего объекта.

#### Structural Структурные:
* +Adapter (Адаптер) - это конвертер между двумя несовместимыми объектами. Используя паттерн адаптера, мы можем объединить два несовместимых интерфейса.
* +Composite (Компоновщик) - использует один класс для представления древовидной структуры.
* +Proxy (Заместитель) - представляет функциональность другого класса.
* +Flyweight (Легковес) - вместо создания большого количества похожих объектов, объекты используются повторно.
* +Facade (Фасад) - беспечивает простой интерфейс для клиента, и клиент использует интерфейс для взаимодействия с системой.
* +Bridge (Мост) - делает конкретные классы независимыми от классов реализации интерфейса.
* +Decorator (Декоратор) - добавляет новые функциональные возможности существующего объекта без привязки его структуры.
Из Java: InputStream is an abstract class. Most concrete implementations like BufferedInputStream, GzipInputStream, ObjectInputStream, etc.
https://springframework.guru/gang-of-four-design-patterns/decorator-pattern/


#### Behavioral Поведенческие
* +Template Method (Шаблонный метод) - определяющий основу алгоритма и позволяющий наследникам переопределять некоторые шаги алгоритма, не изменяя его структуру в целом.
* +Mediator (Посредник) - предоставляет класс посредника, который обрабатывает все коммуникации между различными классами.
  Examples in Java's core libraries:  
  java.util.Timer (all scheduleXXX() methods)  
  java.util.concurrent.Executor#execute()  
  java.util.concurrent.ExecutorService (the invokeXXX() and submit() methods)  
  java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)  
  java.lang.reflect.Method#invoke()    

* +Chain of Responsibility (Цепочка обязанностей) - позволяет избежать жесткой зависимости отправителя запроса от его получателя, при этом запрос может быть обработан несколькими объектами.
  Examples in Java's core libraries:  
  java.util.logging.Logger#log()  
  javax.servlet.Filter#doFilter()  

* Observer (Наблюдатель) - позволяет одним обьектам следить и реагировать на события, происходящие в других объектах.
* Strategy (Стратегия) - алгоритм стратегии может быть изменен во время выполнения программы.
* Command (Команда) - интерфейс команды объявляет метод для выполнения определенного действия.
* State (Состояние) - объект может изменять свое поведение в зависимости от его состояния.
* Visitor (Посетитель) - используется для упрощения операций над группировками связанных объектов.
* Interpreter (Интерпретатор) - определяет грамматику простого языка для проблемной области.
* Iterator (Итератор) - последовательно осуществляет доступ к элементам объекта коллекции, не зная его основного представления.
* Memento (Хранитель) - используется для хранения состояния объекта, позже это состояние можно восстановить.
