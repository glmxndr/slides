package css_awesome

import org.ilaborie.slides.Group
import org.ilaborie.slides.content.*

fun preprocessor(group: Group) = group
        .slide(title = "Bordure des boutons") {
            cssLiveCode("/cssIsAwesome/01_preprocessor/boutons")
        }
        .slide(title = "Alors utilise-t-on un pré&#8209;processeurs ?") {
            Block("Oui, mais privilégiez:".p() +
                          listOf("le CSS", "les post&#8209;processeurs").ul()) +
                    UnorderedList(
                            Link(Code(code = "currentColor"), "https://css-tricks.com/currentcolor/"),
                            Link(Code(code = "background-origin"), "https://developer.mozilla.org/fr/docs/Web/CSS/background-origin"),
                            Link("CSS Variables (aka Custom Properties)", "https://www.w3.org/TR/css-variables/"),
                            Link("CSS Color Module Level 4", "https://www.w3.org/TR/css-color-4/"))
        }