/**
 * Used to load any custom JS functions which can be loaded in the head tag.
 */

$(document).on("pageshow", ".ui-page", function () {
    var $page  = $(this),
        vSpace = $page.children('.ui-header').outerHeight() + $page.children('.ui-footer').outerHeight() + $page.children('.ui-content').height();

    if (vSpace < $(window).height()) {
        var vDiff = $(window).height() - $page.children('.ui-header').outerHeight() - $page.children('.ui-footer').outerHeight() - 30;//minus thirty for margin
        $page.children('.ui-content').height(vDiff);
    }
});