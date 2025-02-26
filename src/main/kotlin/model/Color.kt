package model

enum class Color(val consoleColor: String, val backgroundColor: String, val textColor: String) {
    // Reset
    RESET("\u001b[0m", "transparent", "black"),

    // Regular Colors
    BLACK("\u001b[0;30m", "black", "white"),
    RED("\u001b[0;31m", "red", "white"),
    GREEN("\u001b[0;32m", "green", "black"),
    YELLOW("\u001b[0;33m", "yellow", "black"),
    BLUE("\u001b[0;34m", "blue", "white"),
    PURPLE("\u001b[0;35m", "purple", "white"),
    CYAN("\u001b[0;36m", "cyan", "black"),
    WHITE("\u001b[0;37m", "white", "black"),

    // Bold
    BLACK_BOLD("\u001b[1;30m", "dimgray", "white"),
    RED_BOLD("\u001b[1;31m", "darkred", "white"),
    GREEN_BOLD("\u001b[1;32m", "darkgreen", "white"),
    YELLOW_BOLD("\u001b[1;33m", "darkgoldenrod", "black"),
    BLUE_BOLD("\u001b[1;34m", "darkblue", "white"),
    PURPLE_BOLD("\u001b[1;35m", "darkmagenta", "white"),
    CYAN_BOLD("\u001b[1;36m", "darkcyan", "white"),
    WHITE_BOLD("\u001b[1;37m", "gainsboro", "black"),

    // Underlined
    BLACK_UNDERLINED("\u001b[4;30m", "black", "white"),
    RED_UNDERLINED("\u001b[4;31m", "red", "white"),
    GREEN_UNDERLINED("\u001b[4;32m", "green", "black"),
    YELLOW_UNDERLINED("\u001b[4;33m", "yellow", "black"),
    BLUE_UNDERLINED("\u001b[4;34m", "blue", "white"),
    PURPLE_UNDERLINED("\u001b[4;35m", "purple", "white"),
    CYAN_UNDERLINED("\u001b[4;36m", "cyan", "black"),
    WHITE_UNDERLINED("\u001b[4;37m", "white", "black"),

    // Background Colors
    BLACK_BACKGROUND("\u001b[40m", "black", "white"),
    RED_BACKGROUND("\u001b[41m", "red", "white"),
    GREEN_BACKGROUND("\u001b[42m", "green", "black"),
    YELLOW_BACKGROUND("\u001b[43m", "yellow", "black"),
    BLUE_BACKGROUND("\u001b[44m", "blue", "white"),
    PURPLE_BACKGROUND("\u001b[45m", "purple", "white"),
    CYAN_BACKGROUND("\u001b[46m", "cyan", "black"),
    WHITE_BACKGROUND("\u001b[47m", "white", "black"),

    // High Intensity Colors
    BLACK_BRIGHT("\u001b[0;90m", "gray", "black"),
    RED_BRIGHT("\u001b[0;91m", "orangered", "white"),
    GREEN_BRIGHT("\u001b[0;92m", "limegreen", "black"),
    YELLOW_BRIGHT("\u001b[0;93m", "gold", "black"),
    BLUE_BRIGHT("\u001b[0;94m", "deepskyblue", "black"),
    PURPLE_BRIGHT("\u001b[0;95m", "violet", "black"),
    CYAN_BRIGHT("\u001b[0;96m", "aqua", "black"),
    WHITE_BRIGHT("\u001b[0;97m", "whitesmoke", "black"),

    // Bold High Intensity
    BLACK_BOLD_BRIGHT("\u001b[1;90m", "darkgray", "white"),
    RED_BOLD_BRIGHT("\u001b[1;91m", "tomato", "white"),
    GREEN_BOLD_BRIGHT("\u001b[1;92m", "chartreuse", "black"),
    YELLOW_BOLD_BRIGHT("\u001b[1;93m", "goldenrod", "black"),
    BLUE_BOLD_BRIGHT("\u001b[1;94m", "dodgerblue", "white"),
    PURPLE_BOLD_BRIGHT("\u001b[1;95m", "mediumorchid", "black"),
    CYAN_BOLD_BRIGHT("\u001b[1;96m", "turquoise", "black"),
    WHITE_BOLD_BRIGHT("\u001b[1;97m", "white", "black"),

    // High Intensity Backgrounds
    BLACK_BACKGROUND_BRIGHT("\u001b[0;100m", "darkgray", "white"),
    RED_BACKGROUND_BRIGHT("\u001b[0;101m", "lightcoral", "black"),
    GREEN_BACKGROUND_BRIGHT("\u001b[0;102m", "lightgreen", "black"),
    YELLOW_BACKGROUND_BRIGHT("\u001b[0;103m", "lightyellow", "black"),
    BLUE_BACKGROUND_BRIGHT("\u001b[0;104m", "lightskyblue", "black"),
    PURPLE_BACKGROUND_BRIGHT("\u001b[0;105m", "plum", "black"),
    CYAN_BACKGROUND_BRIGHT("\u001b[0;106m", "paleturquoise", "black"),
    WHITE_BACKGROUND_BRIGHT("\u001b[0;107m", "white", "black")
}
