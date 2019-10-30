package org.iut.nantes.calcul;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Classe de test de la classe {@link Calculette}.
 *
 * @author Thibaut PICHON
 * @version 0.1
 */
public class CalculetteTest {
    /**
     * Objet calculette pour les tests.
     */
    private static Calculette calculette;

    /**
     * Méthode de configuration des données nécessaires pour les tests.
     */
    @BeforeClass
    public static void setUp() {
        // Création d'un objet Calculette avant de débuter les tests.
        calculette = new Calculette();
    }

    /**
     * Test de l'addition de deux nombres entier.
     */
    @Test
    public void testAddition() {
        assertEquals(1 + 2, calculette.add(1, 2));
    }

    /**
     * Test de l'addition de deux nombres.
     * <p>
     * Cas de test n° 1 : Addition de deux entiers.
     */
    @Test
    public void testAddCT1() {
        assertEquals(1 + 2, calculette.add(1, 2));
    }

    /**
     * Test de l'addition de deux nombres.
     * <p>
     * Cas de test n° 2 : Addition d'un entier et d'un float.
     */
    @Test
    public void testAddCT2() {
        assertEquals(1 + 2f, calculette.add(1, 2f));
    }

    /**
     * Test de l'addition de deux nombres.
     * <p>
     * Cas de test n° 3 : Addition d'un entier et d'un double.
     */
    @Test
    public void testAddCT3() {
        assertEquals(1 + 2.0, calculette.add(1, 2.0));
    }

    /**
     * Test de l'addition de deux nombres.
     * <p>
     * Cas de test n° 4 : Addition d'un float et d'un float.
     */
    @Test
    public void testAddCT4() {
        assertEquals(1f + 2f, calculette.add(1f, 2f));
    }

    /**
     * Test de l'addition de deux nombres.
     * <p>
     * Cas de test n° 5 : Addition d'un float et d'un double.
     */
    @Test
    public void testAddCT5() {
        assertEquals(1f + 2.0, calculette.add(1f, 2.0));
    }

    /**
     * Test de l'addition de deux nombres.
     * <p>
     * Cas de test n° 6 : Addition d'un double et d'un double.
     */
    @Test
    public void testAddCT6() {
        assertEquals(1.0 + 2.0, calculette.add(1.0, 2.0));
    }
}
