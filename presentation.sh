#/bin/bash

CHECK_MARK="\033[0;32m\xE2\x9C\x94\033[0m"

clear

echo -e -n "\033[1m
****************************************
* Pourquoi devrait-on faire du Kotlin? *
****************************************
\033[0m"

read
echo -e -n "${CHECK_MARK} 1. Kotlin n'est pas une innovation"
read
echo -e -n "     \033[3m- Très abordable"
read
echo -e -n "     \033[3m- Peu de nouveaux concepts"
read
echo -e -n "     \033[3m- Récupération des best practices"
read

echo -e -n "${CHECK_MARK} 2. Kotlin résout les limitations de JAVA"
read
echo -e -n "     \033[3m- Syntaxe épurée"
read
echo -e -n "     - Null safety"
read
echo -e -n "     - Immutabilité"
read
echo -e -n "     - Paradigme fonctionnelle"
read
echo -e -n "     - Collections enrichies"
read
echo -e -n "     - Fonctions d'extensions"
read
echo -e -n "     - Délégation"
read
echo -e -n "     - Etc"
read

echo -e -n "\033[2m${CHECK_MARK} 3. Interopérabilité totale avec JAVA"
read

echo -e -n "\033[1m
****************************************
* Ce qu'on va vous présenter *
****************************************
\033[0m"
read
echo -e -n "${CHECK_MARK} 0. How Kotlin works with Java ?"
read
echo -e -n "${CHECK_MARK} 1. Basic Syntax: variable declaration, inference type,  class instanciation, default value"
read
echo -e -n "${CHECK_MARK} 2. String template"
read
echo -e -n "${CHECK_MARK} 3. Null Safety (?. !!)"
read
echo -e -n "${CHECK_MARK} 4. Properties"
read
echo -e -n "${CHECK_MARK} 5. Statements vs expressions"
read
echo -e -n "${CHECK_MARK} 6. Null Safety (Elvis operator"
read
echo -e -n "${CHECK_MARK} 7. Pattern Matching with and without parameter"
read
echo -e -n "${CHECK_MARK} 8. Sealed class"
read
echo -e -n "${CHECK_MARK} 9. Extension function"
read
echo -e -n "${CHECK_MARK} 10. Operator overloading"
read
echo -e -n "${CHECK_MARK} 11. Infix function"
read
echo -e -n "${CHECK_MARK} 12. Inheritance vs composition"
read
echo -e -n "${CHECK_MARK} 13. Function as first Class object"
read
echo -e -n "${CHECK_MARK} 14. Standard collection functions (map, filter, find, first, any, all, dropWhile)"
read
echo -e -n "${CHECK_MARK} 15. Standard extension functions (let, apply, run, also, takeIf, takeUnless)"
read
echo -e -n "${CHECK_MARK} 16. Exception Handling"
read


echo -e -n "\033[1m
****************************************
* Conclusion *
****************************************
\033[0m"
read
echo -e -n "${CHECK_MARK} Should I learn Kotlin ?"
read
echo -e -n "${CHECK_MARK} 2nd Most Loved language after Rust - Stackoverflow survey 2018"
read
echo -e -n "${CHECK_MARK} https://insights.stackoverflow.com/survey/2018/"
read
echo -e -n "${CHECK_MARK} Most loved Kotlin features: Null Safety, Extension function, Java interoperability, data classes, high order functions"
read
echo -e -n "${CHECK_MARK} https://pusher.com/state-of-kotlin"
read
echo -e -n "${CHECK_MARK} For the future, Either Kotlin absorbs Java or Java becomes Kotlin ==> Any way, it is worth learning"
read
echo -e -n "${CHECK_MARK} It's your choice :-) "
read
echo -e -n "\033[1m
****************************************
* Thank you for your attention ! *
****************************************
\033[0m"
