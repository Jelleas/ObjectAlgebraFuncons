print_string("a")
;;
(* a
   - : unit = ()
*)

print_string("a") ; print_string("b") ;
;;
(*
  ab
  - : unit = ()
*)

print_string("a") ; print_string("b") ; print_string("c") ; ;;
(*
  abc
  - : unit = ()
*)
