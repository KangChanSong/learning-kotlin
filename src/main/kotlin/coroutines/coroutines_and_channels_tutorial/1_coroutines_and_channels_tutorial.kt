package coroutines.coroutines_and_channels_tutorial

data class User(
    val login: String,
    val contributions: Int,
)

private val users = listOf(
    User("jake", 1),
    User("mike", 2),
    User("mike", 3),
    User("john", 4),
    User("john", 5),
    User("jake", 6),
)

fun groupByLoginAndCountContributions(): List<User> =
    users.groupBy { it.login }
        .map { (login, groups) -> User(login, groups.sumOf { it.contributions }) }
        .sortedByDescending { it.contributions }