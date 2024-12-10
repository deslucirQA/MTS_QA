public interface SearchService {

    /**
     * Поиск животных родившихся в високосный год
     * @param array
     * @return массив имен
     */
    String[] findLeapYearNames(AbstractAnimal[] array);

    /**
     * Поиск животных старше n лет
     * @param array
     * @param n
     * @return массив животных
     */
    AbstractAnimal[] findOlderAnimal(AbstractAnimal[] array, int n);

    /**
     * Поиск дубликатов
     * @param array - массив дубликатов
     */
    void findDuplicate(AbstractAnimal[] array);

}
