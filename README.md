# Втора лабораториска вежба по Софтверско инженерство
## Владимир Тасевски, бр. на индекс 236064
### Control Flow Graph
### Цикломатска комплексност
според бројот на региони се добива дека ципломатската комплексност на графот е 9
### Тест случаи според критериумот  Every statement
SILab2.checkCart(null, "1234567890123456")
Се јавува неуспех затоа што all items е null, фрла исклучок RuntimeException("allItems list can't be null!").
SILab2.checkCart(List.of(new Item(null, 1, 100, 0)), "1234567890123456")
Се јавува неуспех затоа што името на ставката е null, фрла исклучок RuntimeException("Invalid item!").
checkCart(List.of(new Item("BigVKing", 11, 350, 0.1)),  ќе се изврши успешно функцијата
SILab2.checkCart(List.of(new Item("Item1", 1, 100, 0)), "12345678901234AB")
Се јавува неуспех затоа што бројот на картичката содржи невалидни знаци → фрла исклучок RuntimeException("Invalid character in card number!").
SILab2.checkCart(List.of(new Item("Item1", 1, 100, 0)), "1234567890123")
Се јавува неуспех затоа што бројот на картичката не е долг 16 знаци, фрла исклучок RuntimeException("Invalid card number!").

### Тест случаи според критериумот Multiple Condition
Тест случаи според критериумот Multiple Condition:
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)

TXX checkCart(List.of(new Item("Vlahe", 0, 310, 0)), null)
FTX checkCart(List.of(new Item("Vladimir", 1, 100, 0.1)), null)
FFF checkCart(List.of(new Item("Tasevski", 1, 100, 0)), null)
FFT checkCart(List.of(new Item("Shaco", 11, 100, 0)), null)

