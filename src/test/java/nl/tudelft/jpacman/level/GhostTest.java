package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.PointCalculatorLoader;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
public class GhostTest{
    //    Create a levelFactory to create a pellet
    //        Create a PacmanSprites
    private final PacManSprites sprite_loader = new PacManSprites();
    //        Create a GhostFactory
    private GhostFactory ghFactory = new GhostFactory(sprite_loader);
    //        Create a pointCalculator
    private PointCalculatorLoader tempCalc = new PointCalculatorLoader();

    //        Create a level factory
    private LevelFactory Lvl_factory = new LevelFactory(sprite_loader, ghFactory, tempCalc.load());

    //      Create a ghost for the level factory
    private Ghost test_ghost = Lvl_factory.createGhost();

    //      If the ghostIndex is greater than -1(default value) that means that a ghost was created
    @Test
    void testGhost(){
        assertThat(Lvl_factory.getGhostIndex()).isGreaterThan(-1);
    }

}
