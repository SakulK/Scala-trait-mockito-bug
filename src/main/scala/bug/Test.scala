package bug

import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.novus.salat.global._
import com.novus.salat.dao._

case class Test(_id: ObjectId = new ObjectId, name: String)

class TestDao(collection:MongoCollection)  extends SalatDAO[Test, ObjectId](collection) {
  def nonDaoMethod() {
    throw new NullPointerException
  }
}

class TestService(dao: TestDao) {
  def save(test: Test) {
    dao.save(test)
  }
  
  def useNonDaoMethod() {
    dao.nonDaoMethod
  }
}