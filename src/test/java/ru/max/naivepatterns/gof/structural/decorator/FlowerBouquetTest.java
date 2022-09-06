package ru.max.naivepatterns.gof.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerBouquetTest {

    @Test
    public void testFlowerBouquet() {
        FlowerBouquet roseBouquest = new RoseBouquet();
        String descRoseBouquest = roseBouquest.getDescription() + " $ " + roseBouquest.cost();
        assertEquals("Rose bouquet $ 12.5", descRoseBouquest);

        FlowerBouquet decorateRoseBouquet = new RoseBouquet();
        decorateRoseBouquet = new PaperWrapper(decorateRoseBouquet);
        decorateRoseBouquet = new RibbonBow(decorateRoseBouquet);
        decorateRoseBouquet = new Glitter(decorateRoseBouquet);
        String descDecorateRoseBouquet = decorateRoseBouquet.getDescription() + " $ " + roseBouquest.cost();
        assertEquals("Rose bouquet, paper wrap, ribbon bow, glitter $ 12.5", descDecorateRoseBouquet);

        FlowerBouquet decorateOrchidBouquet = new OrchidBouquet();
        decorateOrchidBouquet = new PaperWrapper(decorateOrchidBouquet);
        decorateOrchidBouquet = new RibbonBow(decorateOrchidBouquet);
        decorateOrchidBouquet = new Glitter(decorateOrchidBouquet);
        String descDecorateOrchidBouquet = decorateOrchidBouquet.getDescription() + " $ " + decorateOrchidBouquet.cost();
        assertEquals("Orchid bouquet, paper wrap, ribbon bow, glitter $ 43.4", descDecorateOrchidBouquet);
    }

}