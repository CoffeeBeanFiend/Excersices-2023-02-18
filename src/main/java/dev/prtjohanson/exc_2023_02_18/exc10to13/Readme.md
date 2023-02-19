# Exercises 10-13

## Exercise 10
Create a shop imitating application. Create Basket class that will allow for adding,
removing and retrieving all items in the basket. Each item is an instance of Product
interface that defines two methods, one to get price of an item and one to check for
availability based on a provided date.
Create GenericProduct class that implements Product interface and will have supplier
supplying price and function checking availability based on a provided date for a
particular product.
Make sure that Basket does not expose it’s internal list storing products (meaning it will
not return a reference to it’s internal list but rather a copy), all operations on that list
should be done through Basket methods.

## Exercise 11
Add some products to the Basket from exercise 11. Verify if everything works as
expected.

## Exercise 12
Improve Basket from exercise 10 so that it also tracks quantity of a particular product
and allows for increment or decrement by a specified amount.

## Exercise 13
Create OrderService class that accepts instance of the Basket class from exercise 12 and
returns total price for all the items in the Basket that are available. Remember about
quantity - you will have to improve Basket class again. Use streams.
