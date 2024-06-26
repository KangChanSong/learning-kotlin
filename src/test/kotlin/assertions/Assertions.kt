package assertions

// verify actual object is equal to expected object
result.shouldBe(expected)

// verify actual expression is true
result.shouldBeTrue()

// verify actual object is of given type
result.shouldBeTypeOf<Double>()

// verify actual map contains the given key
result.shouldContainKey(key)

// verify actual map contains the given values
result.shouldContainValues(values)

// verify actual string contains the given substring
result.shouldContain("substring")

// verify actual string is equal to the given string ignoring case
result.shouldBeEqualIgnoringCase(otherString)

// verify actual file should have the given size
result.shouldHaveFileSize(size)

// verify actual date is after the given date
result.shouldBeBefore(otherDate)