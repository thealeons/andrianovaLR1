package logic;

public class KeyGenerator {

    //Генератор ключа, который принемает на вход размер ключа,  а на выход выдает текст
    public String getKey(int size){
        //Все символы алфавита
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        //переменная для ключа
        String key = "";


        while (key.length() != size) {
            //создание нового ключа
            //Создаем случайное число, которое не больше размера алфавита (33)
            //Вытаскиваем по индексу этот символ из алфавита
            //Добавляем в общий ключ пока его не будет равен заданному
            key += alphabet.charAt((int)Math.floor(Math.random() * alphabet.length()));
        }
        return key;
    }

}
