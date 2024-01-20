package core.basesyntax.service.strategy;

import core.basesyntax.dao.FruitDao;
import core.basesyntax.model.Fruit;

public class SupplyHandler implements OperationHandler {
    @Override
    public void getOperation(FruitDao fruitDao, String fruit, int quantity) {
        fruitDao.addCsvRow(new Fruit(Fruit.Operation.SUPPLY, fruit, quantity));
    }
}
