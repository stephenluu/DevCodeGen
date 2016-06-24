# DevCodeGen
generate some code for daily development in Java

## ClassInitGenertor
#### gen some init code for unitTest case for models own a lot of fields

## demo

### input
`User.java`

 ## output
```
User user = new User();
user.setId(1);
user.setUsername("hello1");
user.setLongF(2l);
user.setShortF((short)3);
user.setBooleanF(true);
user.setDoubleF(1.2);
user.setBigDecimalF(new BigDecimal(2.2));
user.setDateF(new Date());

Dog dog = new Dog();
dog.setId(4);
dog.setUsername("hello2");
dog.setLongF(5l);
dog.setShortF((short)6);
dog.setBooleanF(true);
dog.setDoubleF(3.2);
dog.setBigDecimalF(new BigDecimal(4.2));
dog.setDateF(new Date());

Cat cat = new Cat();
cat.setId(7);
cat.setUsername("hello3");
cat.setLongF(8l);
cat.setShortF((short)9);
cat.setBooleanF(true);
cat.setDoubleF(5.2);
cat.setBigDecimalF(new BigDecimal(6.2));
cat.setDateF(new Date());

dog.setCat(cat);

user.setDog(dog);
user.setUsername2("hello4");
 
```