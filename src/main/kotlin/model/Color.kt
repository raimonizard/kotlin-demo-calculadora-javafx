package model

enum class Color(val consoleColor: String, val backgroundColor: String) {
    // Reset
    RESET("\u001b[0m", "transparent"),

    // Regular Colors
    BLACK("\u001b[0;30m", "black"),
    RED("\u001b[0;31m", "red"),
    GREEN("\u001b[0;32m", "green"),
    YELLOW("\u001b[0;33m", "yellow"),
    BLUE("\u001b[0;34m", "blue"),
    PURPLE("\u001b[0;35m", "purple"),
    CYAN("\u001b[0;36m", "cyan"),
    WHITE("\u001b[0;37m", "white"),

    // Bold
    BLACK_BOLD("\u001b[1;30m", "dimgray"),
    RED_BOLD("\u001b[1;31m", "darkred"),
    GREEN_BOLD("\u001b[1;32m", "darkgreen"),
    YELLOW_BOLD("\u001b[1;33m", "darkgoldenrod"),
    BLUE_BOLD("\u001b[1;34m", "darkblue"),
    PURPLE_BOLD("\u001b[1;35m", "darkmagenta"),
    CYAN_BOLD("\u001b[1;36m", "darkcyan"),
    WHITE_BOLD("\u001b[1;37m", "gainsboro"),

    // Underlined
    BLACK_UNDERLINED("\u001b[4;30m", "black"),
    RED_UNDERLINED("\u001b[4;31m", "red"),
    GREEN_UNDERLINED("\u001b[4;32m", "green"),
    YELLOW_UNDERLINED("\u001b[4;33m", "yellow"),
    BLUE_UNDERLINED("\u001b[4;34m", "blue"),
    PURPLE_UNDERLINED("\u001b[4;35m", "purple"),
    CYAN_UNDERLINED("\u001b[4;36m", "cyan"),
    WHITE_UNDERLINED("\u001b[4;37m", "white"),

    // Background Colors
    BLACK_BACKGROUND("\u001b[40m", "black"),
    RED_BACKGROUND("\u001b[41m", "red"),
    GREEN_BACKGROUND("\u001b[42m", "green"),
    YELLOW_BACKGROUND("\u001b[43m", "yellow"),
    BLUE_BACKGROUND("\u001b[44m", "blue"),
    PURPLE_BACKGROUND("\u001b[45m", "purple"),
    CYAN_BACKGROUND("\u001b[46m", "cyan"),
    WHITE_BACKGROUND("\u001b[47m", "white"),

    // High Intensity Colors
    BLACK_BRIGHT("\u001b[0;90m", "gray"),
    RED_BRIGHT("\u001b[0;91m", "orangered"),
    GREEN_BRIGHT("\u001b[0;92m", "limegreen"),
    YELLOW_BRIGHT("\u001b[0;93m", "gold"),
    BLUE_BRIGHT("\u001b[0;94m", "deepskyblue"),
    PURPLE_BRIGHT("\u001b[0;95m", "violet"),
    CYAN_BRIGHT("\u001b[0;96m", "aqua"),
    WHITE_BRIGHT("\u001b[0;97m", "whitesmoke"),

    // Bold High Intensity
    BLACK_BOLD_BRIGHT("\u001b[1;90m", "darkgray"),
    RED_BOLD_BRIGHT("\u001b[1;91m", "tomato"),
    GREEN_BOLD_BRIGHT("\u001b[1;92m", "chartreuse"),
    YELLOW_BOLD_BRIGHT("\u001b[1;93m", "goldenrod"),
    BLUE_BOLD_BRIGHT("\u001b[1;94m", "dodgerblue"),
    PURPLE_BOLD_BRIGHT("\u001b[1;95m", "mediumorchid"),
    CYAN_BOLD_BRIGHT("\u001b[1;96m", "turquoise"),
    WHITE_BOLD_BRIGHT("\u001b[1;97m", "white"),

    // High Intensity Backgrounds
    BLACK_BACKGROUND_BRIGHT("\u001b[0;100m", "darkgray"),
    RED_BACKGROUND_BRIGHT("\u001b[0;101m", "lightcoral"),
    GREEN_BACKGROUND_BRIGHT("\u001b[0;102m", "lightgreen"),
    YELLOW_BACKGROUND_BRIGHT("\u001b[0;103m", "lightyellow"),
    BLUE_BACKGROUND_BRIGHT("\u001b[0;104m", "lightskyblue"),
    PURPLE_BACKGROUND_BRIGHT("\u001b[0;105m", "plum"),
    CYAN_BACKGROUND_BRIGHT("\u001b[0;106m", "paleturquoise"),
    WHITE_BACKGROUND_BRIGHT("\u001b[0;107m", "white")
}
