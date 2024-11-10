# Дизајн и архитектура на софтвер

## Членови:

Андреј Јосимовски 225098
Сара Лазаревска 223225
Ивона Киревска 223221

## Краток опис:

Овој проект се фокусира на развој на веб апликација за автоматска обработка и анализа на историски податоци од Македонската берза. Главната цел е да се создаде систем кој ќе ги автоматизира процесите на преземање, трансформација и складирање на дневните податоци за акциите на сите издавачи на берзата. Податоците ќе бидат анализирани и организирани во соодветен формат, со цел да овозможат лесен пристап до информации, поттикнувајќи анализа на трендовите и перформансите на македонскиот пазар на капитал за последните десет години.

Овој проект користи Pipe and Filter архитектура, со што обезбедува флексибилност и модуларност на системот. Преку филтри, податоците ќе се поминуваат низ различни чекори на трансформација, каде секој филтер ја извршува специфичната задача за да го подготви излезот за следниот филтер.

Проектот е насочен кон овозможување квалитетна анализа на податоците од Македонската берза, преку структура која овозможува постојана автоматска надградба на базата со новите достапни податоци.

## Спецификација на барањата:

## Функциски барања:

1.Автоматско преземање на податоци: Системот треба да ја автоматизира постапката за собирање дневни податоци од Македонската берза за секој издавач.

2.Филтри за трансформација:

  Филтер 1 - Автоматско преземање на сите издавачи од веб-страницата.
 
  Филтер 2 - Проверка на последниот датум на зачувани податоци за секој издавач.
 
  Филтер 3 - Преземање и пополнување на податоци што недостасуваат од последниот зачуван датум до тековниот.

3.Конзистентен формат на податоци: Датумите и цените мора да се форматираат доследно за сите записи.

4.Складирање во база на податоци: Сите обработени податоци треба да се внесуваат во база на податоци или структурирана датотека за понатамошна анализа.

## Нефункциски барања:

1.Робустност: Системот треба да биде отпорен на промени на веб-страницата, како и на можни грешки при преземањето податоци.

2.Перформанси: Обработката на податоците треба да биде оптимизирана за да може да ги процесира сите издавачи и да ги пополнува податоците во разумен рок.

3.Конзистентност и точност: Осигурување дека сите податоци се точни, со стандарден формат за датум и цена, што ќе овозможи лесна анализа.

