let f = fun | 0 1 4 -> `A` ;;
(* f : int -> int -> char = <fun> *)

f 0 1 4;;
(* - : char = `A` *)

f 0 1 5;;
(* Uncaught exception: Match_failure *)
