let f = fun 1 2 -> fun 3 4 -> `A`
                     | 5 6 -> `B` ;;
(* f : int -> int -> int -> int -> char = <fun> *)

f 1 2 3 4;;
(* - : char = `A` *)

f 1 2 5 6;;
(* - : char = `B` *)

f 1 2 9 9;;
(* Uncaught exception: Match_failure *)
