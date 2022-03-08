import java.time.LocalDate
import java.time.temporal.ChronoUnit



fun main() {


    //use todays date as the start date by using the imported java.time.LocalDate Library
    val start = LocalDate.of(2022, 3, 6)
    //use the due date as the end date
    val end = LocalDate.of(2022, 5, 22)
    //this function takes the start date and the end date and finds the number of days inbetween
    val days = ChronoUnit.DAYS.between(start, end)

    println("Start: $start")
    println("End: $end")
    println("Days: $days")

    //make a varible to hold the number of days a full term pregnancy is. 40 weeks, 280 days
    val fullTerm = Integer.valueOf(280)
    //find the difference between the number of days of a full week pregnancy and the days of the pregnancy
    val difference = fullTerm.minus(days)

    val numWeeks = difference.div(7)

    println("Number of weeks pregnant: $numWeeks")


    println("weekly development fact:")
    facts(numWeeks)

    println("size of baby compared to fruit:")
    size(numWeeks)

}


// write a function that will display the size depending on the number of weeks
fun size(numWeeks: Long) {

    if (numWeeks == 5L){
        println("Sesame seed")}
    else if (numWeeks == 6L){
        println("Lentil")}
    else if (numWeeks == 7L){
        println("Blueberry")}
    else if (numWeeks == 8L){
        println("Kidney Bean")}
    else if (numWeeks == 9L){
        println("Grape")}
    else if (numWeeks == 10L){
        println("Kumquat")}
    else if (numWeeks == 11L){
        println("Fig")}
    else if (numWeeks == 12L){
        println("Lime")}
    else if (numWeeks == 13L){
        println("Peapod")}
    else if (numWeeks == 14L){
        println("Lemon")}
    else if (numWeeks == 15L){
        println("Apple")}
    else if (numWeeks == 16L){
        println("Avocado")}
    else if (numWeeks == 17L){
        println("Turnip")}
    else if (numWeeks == 18L){
        println("YBell Pepper")}
    else if (numWeeks == 19L){
        println("Tomato")}
    else if (numWeeks == 20L){
        println("Banana")}
    else if (numWeeks == 21L){
        println("Carrot")}
    else if (numWeeks == 22L){
        println("Spaghetti Squash")}
    else if (numWeeks == 23L){
        println("Large Mango")}
    else if (numWeeks == 24L){
        println("Ear of Corn")}
    else if (numWeeks == 25L){
        println("Rutabaga")}
    else if (numWeeks == 26L){
        println("Scallion")}
    else if (numWeeks == 27L){
        println("Head of Cauliflower")}
    else if (numWeeks == 28L){
        println("Eggplant")}
    else if (numWeeks == 29L){
        println("Butternut Squash")}
    else if (numWeeks == 30L){
        println("Cabbage")}
    else if (numWeeks == 31L){
        println("Coconut")}
    else if (numWeeks == 32L){
        println("Jicama")}
    else if (numWeeks == 33L){
        println("Pineapple")}
    else if (numWeeks == 34L){
        println("Cantaloupe")}
    else if (numWeeks == 35L){
        println("Honeydew Melon")}
    else if (numWeeks == 36L){
        println("Romaine Lettuce")}
    else if (numWeeks == 37L){
        println("Swiss Chard")}
    else if (numWeeks == 38L){
        println("Leek")}
    else if (numWeeks == 39L){
        println("Watermelon")}
    else if (numWeeks == 40L){
        println("")}

    return
}

// write a function that will display a weekly fact depending on the number of weeks
fun facts(numWeeks: Long) {

    if (numWeeks == 5L){
        println("Your little one now has a two-chamber heart, and the heart starts beating")}
    else if (numWeeks == 6L){
        println("Your baby’s eyelids are starting to form, and the brain is developing fast")}
    else if (numWeeks == 7L){
        println("Tiny paddle structures are starting to form which will become hands and feet, the eye color is starting to form")}
    else if (numWeeks == 8L){
        println("The heart is now fully developed into four chambers and sex organs are starting to form")}
    else if (numWeeks == 9L){
        println("The fingers and toes become properly separated and lose any webbing, joints are starting to form, and the eyes are moving from the side of the head to the front")}
    else if (numWeeks == 10L){
        println("Fingernails are formed, and the placenta will start to function")}
    else if (numWeeks == 11L){
        println("Your baby is now able to bend, stretch, kick, and even make faces")}
    else if (numWeeks == 12L){
        println("Your baby’s lungs are practicing breathing with amniotic fluid")}
    else if (numWeeks == 13L){
        println("Your baby’s arms are now proportionate to their body, but their legs are a bit shorter")}
    else if (numWeeks == 14L){
        println("Your baby can now rub its eyes, yawn, and blink")}
    else if (numWeeks == 15L){
        println("Arms and legs are completely formed")}
    else if (numWeeks == 16L){
        println("The meconium (the first bowel movement your baby will have after birth) is starting to form in your baby’s bowel")}
    else if (numWeeks == 17L){
        println("Your baby’s hearing is now developed so it can hear noises outside the womb more clearly")}
    else if (numWeeks == 18L){
        println("Your baby is now covered with vernix")}
    else if (numWeeks == 19L){
        println("At this point your baby is developing a more regular sleep pattern and you may become more aware of them")}
    else if (numWeeks == 20L){
        println("Your baby’s gender can now be identified on an ultrasound")}
    else if (numWeeks == 21L){
        println("The eyelashes and eyebrows are now formed")}
    else if (numWeeks == 22L){
        println("Your baby is starting to look cuter and more like how he or she will look at birth.")}
    else if (numWeeks == 23L){
        println("Your baby’s hair is changing to the color it will have at birth")}
    else if (numWeeks == 24L){
        println("The nostrils are beginning to open")}
    else if (numWeeks == 25L){
        println("Music and voices will leave an impression in your baby’s brain.")}
    else if (numWeeks == 26L){
        println("Your baby will start practicing the sucking reflex.")}
    else if (numWeeks == 27L){
        println(" You baby is able to recognize different levels of light.")}
    else if (numWeeks == 28L){
        println("All the internal organs are maturing and preparing to function on their own at birth.")}
    else if (numWeeks == 29L){
        println("Your baby is now able to see even though it is dark.")}
    else if (numWeeks == 30L){
        println("Your baby is practicing breathing most of the time.")}
    else if (numWeeks == 31L){
        println("Your baby can now use all five senses and is busy looking around.")}
    else if (numWeeks == 32L){
        println("Your baby can now tell the difference between day and night")}
    else if (numWeeks == 33L){
        println("The digestive system is fully working, and your baby is peeing up to a pint of urine a day into the amniotic fluid.")}
    else if (numWeeks == 34L){
        println("From now until birth your baby will gain approximately half a pound per week.")}
    else if (numWeeks == 35L){
        println("Your baby’s gums have ridges that look a bit like teeth.")}
    else if (numWeeks == 36L){
        println("Lungs are fully developed, which means your baby would be able to breathe on its own if born now")}
    else if (numWeeks == 37L){
        println("Your baby’s fingernails continue to grow but remain soft")}
    else if (numWeeks == 38L){
        println("Your baby is continuing to build-up fat under the skin")}
    else if (numWeeks == 39L){
        println("Your baby has 300 bones, an adult has only 206")}
    else if (numWeeks == 40L){
        println("Your pregnancy is full term")}

    return
}








