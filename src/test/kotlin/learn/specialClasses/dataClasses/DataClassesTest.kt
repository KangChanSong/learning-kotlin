package learn.specialClasses.dataClasses

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.shouldNotBeSameInstanceAs

class DataClassesTest: DescribeSpec({
    describe("data class는") {
        it("equals()를 기본제공한다.") {
            val o1 = MyDataClass(1,1)
            val o2 = MyDataClass(1, 1)
            val diffO = MyDataClass(1, 3)

            o1 shouldBe o2
            o1.hashCode() shouldBe o2.hashCode()
            o1 shouldNotBeSameInstanceAs  o2

            o1 shouldNotBe diffO
            o1.hashCode() shouldNotBe diffO
            o1 shouldNotBeSameInstanceAs diffO
        }

        it("copy()를 기본 제공한다.") {
            val o1 = MyDataClass(1, 1)
            val o2 = o1.copy()

            o1 shouldBe o2
            o1.hashCode() shouldBe o2.hashCode()
            o1 shouldNotBeSameInstanceAs o2
        }

        it("copy() 시 필드 값을 변경할 수 있다.") {
            val o1 = MyDataClass(1, 1)
            val o2 = o1.copy(x = 2, y = 3)

            o1 shouldNotBe  o2
            o1.hashCode() shouldNotBe  o2.hashCode()
            o1 shouldNotBeSameInstanceAs o2
        }

        it("component{N}() 메서드는 N번째 필드 값을 반환한다.") {
            val o1 = MyDataClass(1, 10)

            o1.x shouldBe o1.component1()
            o1.y shouldBe o1.component2()
        }

        it("pretty-print 해주는 toString() 메서드를 기본제공한다.") {
            val o1 = MyDataClass(1, 10)
            val expected = "MyDataClass(x=1, y=10)"

            expected shouldBe o1.toString()
        }
    }
})