package homework.task001.RewFabric.Classes.Rewards.Sapphire;

import homework.task001.RewFabric.Classes.IGameItem;
import homework.task001.RewFabric.Classes.ItemGenerator;

public class SapphireFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}