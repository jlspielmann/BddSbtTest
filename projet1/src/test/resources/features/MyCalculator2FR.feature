# language: fr
# encoding: utf-8
Fonctionnalité: My Calculator2

  \##I want to see if my calculator works.
  It is important that I can document **all** functionality with markdown
  I'm trying this here:

  * First item
  * Second item
  * third item
  * fourth item
  * fourth item
  Colons can be used to align columns.
  | Tables        | Are           | Cool  |
  | ------------- |:-------------:| -----:|
  | col 3 is      | right-aligned | $1600 |
  | col 2 is      | centered      |   $12 |
  | zebra stripes | are neat      |    $1 |
  There must be at least 3 dashes separating each header cell.
  The outer pipes (|) are optional, and you don't need to make the
  raw Markdown line up prettily. You can also use inline Markdown.
  Markdown | Less | Pretty
  --- | --- | ---
  *Still* | `renders` | **nicely**
  1 | 2 | 3
  1. First ordered list item
  2. Another item
  ⋅⋅* Unordered sub-list.
  1. Actual numbers don't matter, just that it's a number
  ⋅⋅1. Ordered sub-list
  4. And another item.

  ⋅⋅⋅You can have properly indented paragraphs within list items. Notice the blank line above, and the leading spaces (at least one, but we'll use three here to also align the raw Markdown).

  ⋅⋅⋅To have a line break without a paragraph, you will need to use two trailing spaces.⋅⋅
  ⋅⋅⋅Note that this line is separate, but within the same paragraph.⋅⋅
  ⋅⋅⋅(This is contrary to the typical GFM line break behaviour, where trailing spaces are not required.)

  * Unordered list can use asterisks
  - Or minuses
  + Or pluses

  Scénario: Should add two positive numbers2

    We want to add markdown here as well!
    *Test* **Test** ***Test***
    OK?
    Colons can be used to align columns.
    | Tables        | Are           | Cool  |
    | ------------- |:-------------:| -----:|
    | col 3 is      | right-aligned | $1600 |
    | col 2 is      | centered      |   $12 |
    | zebra stripes | are neat      |    $1 |


    Etant donné que ma calculatrice est fonctionel
    Quand j'ajoute 1 et 2
    Alors le résultat devrait être 3

  Scénario: Should subtract two positive numbers
    Etant donné que ma calculatrice est fonctionel
    Quand je enlève 1 de 2
    Alors le résultat devrait être 1