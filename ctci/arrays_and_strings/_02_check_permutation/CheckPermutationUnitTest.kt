package ctci.arrays_and_strings._02_check_permutation

import org.junit.Assert
import org.junit.Test

class CheckPermutationUnitTest {

    @Test
    fun testCheckPermutation() {
        Assert.assertEquals(true, CheckPermutation().arePermutationsSolutionOne("boob", "bobo"))
        Assert.assertEquals(true, CheckPermutation().arePermutationsSolutionTwo("peter", "teper"))
    }

    @Test
    fun testCheckPermutationEmptyString() {
        Assert.assertEquals(true, CheckPermutation().arePermutationsSolutionOne("", ""))
        Assert.assertEquals(true, CheckPermutation().arePermutationsSolutionTwo("", ""))
    }

    @Test
    fun testCheckPermutationLengths() {
        Assert.assertEquals(false, CheckPermutation().arePermutationsSolutionOne("abcd", "abc"))
        Assert.assertEquals(false, CheckPermutation().arePermutationsSolutionTwo("bounce", "bounc"))
    }

    @Test
    fun testCheckPermutationCaseSensitive() {
        Assert.assertEquals(false, CheckPermutation().arePermutationsSolutionOne("abcd", "abcD"))
        Assert.assertEquals(false, CheckPermutation().arePermutationsSolutionTwo("Coding", "coding"))
    }

}