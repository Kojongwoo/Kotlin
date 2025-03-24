// Kotlin 변수 선언 방법
// val 'name': 'data type' = 'initial value'
// 변수 출력 방법 : "$변수명"
// 변수가 변경되지 않을 것으로 예상(상수): val,
// 변수가 변경될 것으로 예상 : var
// 증감연산자: 변수++ or 변수--
// val totalTripLength: Double = trip1 + trip2 + trip3
// 함수 정의는 fun으로, 정의할 때 파라미터를 설정해 함수에서 호출

//// 연습문제 11. 함수로 중복 코드 이동
//fun main() {
//    println(info(city = "Ankara", lowTemperature = 27, highTemperature = 31, percentOfRain = 82.0))
//    println(info(city = "Tokyo", lowTemperature = 32, highTemperature = 36, percentOfRain = 10.0))
//    println(info(city="Cape Town", lowTemperature=59, highTemperature=64, percentOfRain=2.0))
//    println(info(city="Guatemala City", lowTemperature=50, highTemperature=55, percentOfRain=7.0))
//}
//
//fun info(city: String, lowTemperature: Int, highTemperature: Int, percentOfRain: Double): String {
//    return "Today's $city weather: Low Temperature is $lowTemperature, High Temperature is $highTemperature, Percent of Rain is $percentOfRain."
//}

//// 연습문제 10. 두 숫자 비교
//fun main() {
//    val timeSpentToday = 300
//    val timeSpentYesterday = 250
//    println(time(timeSpentToday, timeSpentYesterday))
//
//    val timeSpentToday2 = 300
//    val timeSpentYesterday2 = 300
//    println(time(timeSpentToday2, timeSpentYesterday2))
//
//    val timeSpentToday3 = 200
//    val timeSpentYesterday3 = 220
//    println(time(timeSpentToday3, timeSpentYesterday3))
//}
//
//fun time(timeToday : Int, timeYesterday : Int): Boolean {
//    return timeToday > timeYesterday
//}

//// 연습문제 9. 만보계
//fun main() {
//    val numberOFSteps = 4000
//    val caloriesBurned = pedometerStepsTocalories(numberOFSteps);
//    println("Walking $numberOFSteps steps burns $caloriesBurned calories")
//}
//
//fun pedometerStepsTocalories(numberOFStepS: Int): Double {
//    val caloriesBURNEDforEachStep = 0.04
//    val totalCALORIESburned = numberOFStepS * caloriesBURNEDforEachStep
//    return totalCALORIESburned
//}


//// 연습문제 8. 기본 매개변수
//fun main() {
//    val firstUserEmailId = "user_one@gmail.com"
//
//    // The following line of code assumes that you named your parameter as emailId.
//    // If you named it differently, feel free to update the name.
//    println(displayAlertMessage(operatingSystem = "Unknown os", emailId = firstUserEmailId))
//    println()
//
//    val secondUserOperatingSystem = "Windows"
//    val secondUserEmailId = "user_two@gmail.com"
//
//    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
//    println()
//
//    val thirdUserOperatingSystem = "Mac OS"
//    val thirdUserEmailId = "user_three@gmail.com"
//
//    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
//    println()
//}
//
//fun displayAlertMessage(operatingSystem: String, emailId: String): String {
//    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
//}

// Define your displayAlertMessage() below this line.
//// 연습문제 7. 기본적인 수학 연산 구현
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val thirdNumber = 8
//
//    val result = firstNumber + secondNumber
//    println("$firstNumber + $secondNumber = $result")
//
//    val anotherResult = add(firstNumber, thirdNumber)
//    println("$firstNumber + $thirdNumber = $anotherResult")
//
//    val anotherResult2 = subtract(firstNumber, thirdNumber)
//    println("$firstNumber - $thirdNumber = $anotherResult2")
//}
//fun add(number1: Int, number2: Int): Int {
//    return number1 + number2
//}
//fun subtract(number1: Int, number2: Int): Int {
//    return number1 - number2
//}


//// 연습문제 6. 메세지 서식
//fun main() {
//    val baseSalary = 5000
//    val bonusAmount = 1000
//    val totalSalary = baseSalary + bonusAmount
//    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
//}

//// 연습문제 5. 문자열 연결
//fun main() {
//    val numberOfAdults = 20
//    val numberOfKids = 30
//    val total = numberOfAdults + numberOfKids
//    println("The total party size is: $total")
//}

//// 연습문제 4. 문자열 템플릿
//fun main() {
//    var discountPercentage: Int = 0
//    var offer: String = ""
//    val item = "Google Chromecast"
//    discountPercentage = 20 // 변수가 변경될 경우 var로 선언
//    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
//    println(offer)
//}

// 연습문제 3. 컴파일 오류 수정
//fun main() {
//    println("New chat message from a friend")
//}

// 연습문제 2. 메시지 인쇄
//fun main() {
//    println("Use the val keyword when the value doesn't change.")
//    println("Use the var keyword when the value can change.")
//    println("When you define a function, you define the parameters that can be passed to it.")
//    println("When you call a function, you pass arguments for the parameters.")
//}

//fun main() {
////    val greeting = birthdayGreeting("Rover")
////    println(birthdayGreeting("Rover", 10))
////    println(birthdayGreeting("Rex", 19))
//    println(birthdayGreeting(age=5)) // name의 기본값은 Rover, 출력은 Rover, 5
//    println(birthdayGreeting(age=18))
//}
//
//fun birthdayGreeting(name: String = "Rover", age: Int): String {
////    val nameGreeting = "Happy Birthday, $name!"
////    val ageGreeting = "You are now $age years old!"
////    return "$nameGreeting + $ageGreeting"
//    return "Happy Birthday, $name! You are now $age years old!"
//}