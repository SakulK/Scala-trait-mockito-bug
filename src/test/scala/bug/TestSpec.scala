package bug

import org.scalatest.Spec
import org.scalatest.mock.MockitoSugar

class TestSpec extends Spec with MockitoSugar {

  describe("Mocking SalatDAO") {
    val dao = mock[TestDao]
    val sut = new TestService(dao)
    
    it("works for non DAO methods") {
      sut.useNonDaoMethod
    }
    
    it("dosent let mock the DAO methods") {
      sut.save(Test(name = "test"))
    }
  }
}