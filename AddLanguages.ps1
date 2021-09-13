$LanguageList = Get-WinUserLanguageList # Gets language list

# $LanguageList # Prints current info
# Tutorial: https://4sysops.com/archives/adding-and-removing-keyboard-languages-with-powershell/
# Language codes: https://docs.microsoft.com/en-us/windows-hardware/manufacture/desktop/available-language-packs-for-windows
$LanguageList.Add("el-GR") # Greek
$LanguageList.Add("ja-JP") # Japanese
Set-WinUserLanguageList $LanguageList # Sets language list
