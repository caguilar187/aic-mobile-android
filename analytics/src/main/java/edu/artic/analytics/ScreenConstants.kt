package edu.artic.analytics

/**
 * Description:
 */
sealed class ScreenCategoryName(val screenName: String) {
    object Home : ScreenCategoryName("Home")
    object AudioGuide : ScreenCategoryName("Audio Guide")
    object Map : ScreenCategoryName("Map")
    object Information : ScreenCategoryName("Information")
    object MuseumInformation : ScreenCategoryName("Museum Information")
    object LanguageSettings : ScreenCategoryName("Language Settings")
    object LocationSettings : ScreenCategoryName("Location Settings")
    object Events : ScreenCategoryName("Events")
    object OnView : ScreenCategoryName("On View")
    object Exhibition : ScreenCategoryName("Exhibition")
    object Tours : ScreenCategoryName("Tours")
    object Search : ScreenCategoryName("Search")
    object AudioPlayer : ScreenCategoryName("Audio Player")
    object TourDetails : ScreenCategoryName("Tour Details")
    object OnViewDetails : ScreenCategoryName("On View Details")
    object EventDetails : ScreenCategoryName("Event Details")
    object ArtworkSearchDetails : ScreenCategoryName("Artwork Search Details")
    object App : ScreenCategoryName("App")

    override fun toString(): String {
        return "ScreenCategoryName(screenName='$screenName')"
    }
}

object AnalyticsAction {
    const val APP_OPENED = "open"
    const val APP_BACKGROUNDED = "background"
    const val APP_FOREGROUNDED = "foreground"

    const val languageSelected = "selected"
    const val languageChanged = "changed"

    const val locationOnSite = "on_site"
    const val locationOffSite = "off_site"
    const val locationDisabled = "disabled"
    const val locationNotNowPressed = "not_now_pressed"
    const val locationHeadingEnabled = "heading_enabled"

    const val playAudioTour = "tour"
    const val playAudioTourStop = "tour_stop"
    const val playAudioAudioGuide = "audio_guide"
    const val playAudioMap = "map"
    const val playAudioSearch = "search"

    const val playbackInterrupted = "interrupted"
    const val playbackCompleted = "completed"

    const val tourStarted = "started"
    const val tourLeft = "left"

    const val OPENED = "opened"            // tour, exhibition and event Categories
    const val linkPressed = "link_pressed"    // exhibition and event Categories

    const val mapShowExhibition = "show_exhibition"
    const val mapShowArtwork = "show_artwork"
    const val mapShowDining = "show_dining"
    const val mapShowMemberLounge = "show_member_lounge"
    const val mapShowGiftShops = "show_gift_shops"
    const val mapShowRestrooms = "show_restrooms"

    const val memberShowCard = "show_card"
    const val memberJoinPressed = "join_pressed"

    const val museumInfoPhoneLink = "phone_link"
    const val museumInfoAddressLink = "address_link"

    const val searchLoaded = "loaded"
    const val searchAutocomplete = "autocomplete"
    const val searchPromoted = "promoted"
    const val searchNoResults = "no_results"
    const val searchAbandoned = "abandoned"
    const val searchResultTapped = "result_tapped"
    const val searchCategorySwitched = "category_switched"

    const val errorsAudioGuideFail = "audio_guide_fail"
}

object AnalyticsLabel {
    const val Empty = ""
}